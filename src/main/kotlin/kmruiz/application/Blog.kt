package kmruiz.application

import kmruiz.domain.post.Post
import kmruiz.domain.post.PostService
import kmruiz.domain.post.PostView
import kmruiz.domain.user.UserService
import java.util.*

data class Blog(val userService: UserService, val postService: PostService) {
    fun publishPost(userId: Long, title: String, body: String): Post {
        val user = userService.findUser(userId)
        return postService.publish(user, title, body)
    }

    fun lastPosts(userId: Long, startDate: Date): List<PostView> {
        val user = userService.findUser(userId)
        return postService.last(user, startDate)
    }
}
