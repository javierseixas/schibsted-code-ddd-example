package kmruiz.domain.post

import java.util.*

data class PostViewIdQuery(val startDate: Date, val count: Int)

interface PostViewer {
    fun selectPostIndex(startDate: Date): PostViewIdQuery
}

interface PostViewReadModel {
    fun findLast(idQuery: PostViewIdQuery): List<PostView>
}

data class PostView(val author: String, val title: String, val body: String, val publicationDate: Date)
