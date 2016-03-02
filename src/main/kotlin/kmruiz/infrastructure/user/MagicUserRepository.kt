package kmruiz.infrastructure.user

import kmruiz.domain.user.Administrator
import kmruiz.domain.user.User
import kmruiz.domain.user.UserRepository
import java.util.*

interface Magic {
    fun findUserById(id: Long): User?
}

data class MagicUserRepository(val magic: Magic): UserRepository {
    override fun findUser(id: Long): User {
        val user = magic.findUserById(id)
        if (user != null) {
            return user
        }
        throw NoSuchElementException("User with Id $id")
    }

    override fun findAdministrator(id: Long): Administrator {
        val user = magic.findUserById(id)
        if (user != null && user is Administrator) {
            return user
        }

        throw NoSuchElementException("User with Id $id")
    }
}
