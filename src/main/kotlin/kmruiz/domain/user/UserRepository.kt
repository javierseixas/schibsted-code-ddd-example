package kmruiz.domain.user

interface UserRepository {
    fun findAdministrator(id: Long): Administrator
    fun findUser(id: Long): User
}
