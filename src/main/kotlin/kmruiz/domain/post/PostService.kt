package kmruiz.domain.post

import kmruiz.domain.user.Administrator
import java.util.*

data class PostService(val postRepository: PostRepository, val postViewReadModel: PostViewReadModel) {
    fun publish(publisher: PostPublisher, title: String, body: String): Post {
        val post = publisher.publishPost(title, body)
        return postRepository.savePost(post)
    }

    fun last(viewer: PostViewer, startDate: Date): List<PostView> {
        val idQuery = viewer.selectPostIndex(startDate)
        return postViewReadModel.findLast(idQuery)
    }

    fun publishPendingPost(administrator: Administrator, title: String): Post {
        val post = postRepository.findPost(title)
        val moderatedPost = administrator.publishPendingPost(post)
        return postRepository.savePost(moderatedPost)
    }
}
