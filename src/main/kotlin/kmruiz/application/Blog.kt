package kmruiz.application

import kmruiz.domain.post.Post
import kmruiz.domain.post.PostService
import kmruiz.domain.user.UserService

data class Blog(val userService: UserService, val postService: PostService) {
    fun publishPost(userId: Long, title: String, body: String): Post {
        val user = userService.findUser(userId)
        return postService.publish(user, title, body)
    }
}
