package com.example

import com.example.models.Person
import storage.PersonDto

fun Person.toDto(): PersonDto=PersonDto(
    id = this.id.toString(),
    name = this.name,
    age= this.age
)

fun PersonDto.toPerson(): Person= Person(
    name = this.name,
    age = this.age
)