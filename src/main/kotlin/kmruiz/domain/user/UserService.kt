package kmruiz.domain.user

data class UserService(val userRepository: UserRepository) {
    fun findUser(id: Long) = userRepository.findUser(id)
    fun findAdministrator(id: Long) = userRepository.findAdministrator(id)
}
