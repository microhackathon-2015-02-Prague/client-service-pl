package com.ofg.twitter.client.service

import com.ofg.twitter.client.entities.Client
import com.ofg.twitter.client.json.ClientBean
import com.ofg.twitter.client.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ClientService {

    @Autowired
    private ClientRepository repository

    Client storeClient(ClientBean clientBean) {
        Client client = new Client()
        client.age = clientBean.age
        client.name = clientBean.name
        client.surname = clientBean.surname
        client.loanId = clientBean.loanId

        Client result = repository.save(client)
        result
    }


}
