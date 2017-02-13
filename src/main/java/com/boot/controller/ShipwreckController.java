package com.boot.controller;

import com.boot.model.Shipwreck;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vadulasp on 8/23/16.
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    static final Logger LOGGER  = Logger.getLogger(ShipwreckController.class);

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list(){
        LOGGER.info("Getting all the shipwrecks");
        return ShipwreckStub.list();
    }

    @RequestMapping(value = "shipwrecks{id}", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        LOGGER.info("Adding a shipwreck: " + shipwreck.getId());
        return ShipwreckStub.create(shipwreck);
    }

    @RequestMapping(value = "shipwrecks{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id){
        LOGGER.info("Getting a shipwreck: " + id);
        return ShipwreckStub.get(id);
    }

    @RequestMapping(value = "shipwrecks{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
        LOGGER.info("Updating a shipwreck: " + id);
        return ShipwreckStub.update(id, shipwreck);
    }

    @RequestMapping(value = "shipwrecks{id}", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id){
        LOGGER.info("deleting a shipwreck: " + id);
        return ShipwreckStub.delete(id);
    }
}
