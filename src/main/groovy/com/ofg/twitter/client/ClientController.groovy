package com.ofg.twitter.client

import com.ofg.twitter.client.entities.Client
import com.ofg.twitter.client.json.ClientBean
import com.ofg.twitter.client.service.ClientService
import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import static org.springframework.web.bind.annotation.RequestMethod.POST

@Slf4j
@RestController
@RequestMapping('/client')
@Api(value = "client", description = "Operations on clients")
class ClientController {


    @Autowired
    ClientService clientService


    @RequestMapping(
            value = '/api/client',
            method = POST,
            consumes = 'application/json',
            produces = 'application/json')
    @ApiOperation(value = "Store clint",
            notes = "The client store")
    @ResponseBody
    String storeClient(@RequestBody ClientBean clientBean) {
        Client client = clientService.storeClient(clientBean)
        "{   \"id\": ${client.id}  }"
    }

}
