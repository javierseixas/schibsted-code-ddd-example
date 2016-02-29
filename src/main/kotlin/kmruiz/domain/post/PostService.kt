package kmruiz.domain.post

import kmruiz.domain.user.User
import java.util.*

data class PostService(val postRepository: PostRepository, val postViewReadModel: PostViewReadModel) {
    fun publish(publisher: PostPublisher, title: String, body: String): Post {
        val post = publisher.publishPost(title, body)
        return postRepository.savePost(post)
    }

    fun last(viewer: PostViewer, startDate: Date): List<Post> {
        val idQuery = viewer.selectPostIndex(startDate)
        return postViewReadModel.findLast(idQuery)
    }
}
