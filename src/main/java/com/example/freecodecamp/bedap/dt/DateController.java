package com.example.freecodecamp.bedap.dt;

import com.example.freecodecamp.bedap.dt.dto.DateResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bedap/date/api")
public class DateController {
    @GetMapping({"", "/", "/{date}"})
    public DateResponse getDate(@PathVariable(required = false) String date) {
        if (date == null || date.isEmpty()) {
            return new DateResponse();
        }
        boolean isNum = date.matches("^\\d+$");
        if (isNum) {
            return new DateResponse(Long.parseLong(date));
        }
        return new DateResponse(date);
    }
}
