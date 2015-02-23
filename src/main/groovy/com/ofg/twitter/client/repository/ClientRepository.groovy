package com.ofg.twitter.client.repository

import com.ofg.twitter.client.entities.Client
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository extends CrudRepository<Client, Long> {


}