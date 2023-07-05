package startSpring.startSpring.user.controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import startSpring.startSpring.user.controller.dto.JoinRequest;
import startSpring.startSpring.user.model.UserProfile;
import startSpring.startSpring.user.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserProfileController {
//
//    private Map<String, UserProfile> useMap;
//
//    @PostConstruct
//    public void init() {
//        useMap = new HashMap<String, UserProfile>();
//        useMap.put("1", new UserProfile("1", "테스트1", 30));
//        useMap.put("2", new UserProfile("2", "테스트2", 30));
//        useMap.put("3", new UserProfile("3", "테스트3", 30));
//    }
//
//    //  user 하나만 불러오기
//    @GetMapping(value = "/user/{id}")
//    public UserProfile getUserInfor(@PathVariable("id") String id) {
//        return useMap.get(id);
//    }
//
//    //  user 전부 불러오기
//    @GetMapping("/user/all")
//    public List<UserProfile> getUserAllInfor() {
//        return new ArrayList<UserProfile>(useMap.values());
//    }
//
//    @PutMapping("/user/{id}")
//    public void putUserInfor(@PathVariable("id") String id,
//                             @RequestBody UserProfile userProfile
//    ) {
//        System.out.println(String.valueOf(userProfile));
//
//        useMap.put(id, userProfile);
//    }
//   @PutMapping("/user/{id}")
//    public void putUserInfor(@PathVariable("id") String id,
//                             @RequestParam("name") String name,
//                             @RequestParam("age") Integer age ){
//
//        UserProfile userProfile = new UserProfile(id,name,age);
//        useMap.put(id,userProfile);
//    }

    private final UserService userService;

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest) {
        String id = joinRequest.getId();
        String name = joinRequest.getName();
        int age = joinRequest.getAge();

        String result = userService.join(id, name, age);
        if (result.equalsIgnoreCase("성공")) {
            return "성공";
        } else {
            return "실패";
        }
    }


}
