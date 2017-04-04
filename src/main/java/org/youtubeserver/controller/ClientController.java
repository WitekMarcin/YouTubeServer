package org.youtubeserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.youtubeserver.model.YouTubeTask;
import org.youtubeserver.service.YoutubeTaskService;

/**
 * Created by Marcin on 04.04.2017.
 */
@Controller
public class ClientController {

    @Autowired
    YoutubeTaskService youtubeTaskService;

    @RequestMapping(value = "/server/create_task",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<YouTubeTask> createAccount(@RequestBody YouTubeTask youTubeTask) {

        return new ResponseEntity<>(youtubeTaskService.create(youTubeTask), HttpStatus.CREATED);

    }
}
