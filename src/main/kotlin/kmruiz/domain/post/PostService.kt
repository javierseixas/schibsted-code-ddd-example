package kmruiz.domain.post

data class PostService(val postRepository: PostRepository) {
    fun publish(publisher: PostPublisher, title: String, body: String): Post {
        val post = publisher.publishPost(title, body)
        return postRepository.savePost(post)
    }
}
