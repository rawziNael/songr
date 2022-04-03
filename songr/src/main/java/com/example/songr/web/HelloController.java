package com.example.songr.web;

import com.example.songr.domain.Album;
import com.example.songr.domain.Song;
import com.example.songr.infrastructure.AlbumRepository;
import com.example.songr.infrastructure.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HelloController {

    @Autowired
    AlbumRepository albumRepository;
    SongRepository songRepository;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/hello")
    String hello(@RequestParam(name = "name", required = false, defaultValue = "Rawzi") String name, Model model){

        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/capitalize")
    public String capitalizeQuery(@RequestParam(name="name", required = false , defaultValue = "rawzi") String name , Model model){

        name = name.toUpperCase();
        model.addAttribute("name",name);
        return "Capitalize" ;
    }

//    @ResponseBody
//    @GetMapping("/albums")
//    List<Album> getAlbums() {
//        List<Album> albums = new ArrayList<>();
//        albums.add(new Album("Tabib Garah", "George", 6, 7.25, ""));
//        albums.add(new Album("Lonely", "Akon", 5, 5.59, ""));
//        albums.add(new Album("", "Emenim", 5, 6.33, ""));
//        albumRepository.save(albums.get(0));
//        albumRepository.save(albums.get(1));
//        albumRepository.save(albums.get(2));
//
//        return albums;
//    }

    //*********************************************lab12**********************************************


    @PostMapping("/addalbums")
     RedirectView createAlbum(@ModelAttribute Album album) {
        albumRepository.save(album);
        return new RedirectView("/allalbums");
    }

    @GetMapping("/allalbums")
    public String showAlbums(Model model) {
        model.addAttribute("albumsList", albumRepository.findAll());
        return "album";
    }

    //*********************************************lab13**********************************************

    @GetMapping(value="/songs")
    public String getSongs(Model song) {
        song.addAttribute("songsList", songRepository.findAll());
        return "songs";
    }

    @ResponseBody
    @PostMapping(value="/songs")
    public RedirectView createSong(@ModelAttribute Song song) {
        System.out.println(song);
        songRepository.save(song);
        return new RedirectView("/songs");
    }
}
