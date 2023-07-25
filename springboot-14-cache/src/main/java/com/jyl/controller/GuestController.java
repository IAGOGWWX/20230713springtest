package com.jyl.controller;


import com.jyl.model.Guest;
import com.jyl.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;


    @GetMapping("")
    public List<Guest> getGuests(Model model) {
        List<Guest> result = guestService.getGuests();
        return result;
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable(name = "id") int id) {
        Guest guest = guestService.getGuestById(id);
        return guest;
    }

    @PutMapping("/{id}/{name}/{role}")
    public Guest updateGuest(@PathVariable (name="id") Integer id, @PathVariable (name="name") String name, @PathVariable (name="role")String role) {
        Guest newGuest = new Guest(id, name, role);
        guestService.updateGuest(newGuest);
        return newGuest;
    }

    @DeleteMapping("/{id}")
    public String deleteGuest(@PathVariable(name = "id") int id) {
        if (id != 0) {
            guestService.deleteGuest(id);
        } else {
            guestService.deleteAllGuest();
        }
        return "Success";
    }


}
