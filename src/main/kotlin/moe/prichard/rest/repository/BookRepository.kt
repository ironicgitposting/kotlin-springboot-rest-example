package moe.prichard.rest.repository

import moe.prichard.rest.model.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book, Long>
{
    fun findByTitle(title: String) : Book
}