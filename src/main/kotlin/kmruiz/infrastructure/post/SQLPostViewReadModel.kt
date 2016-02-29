package kmruiz.infrastructure.post

import kmruiz.domain.post.Post
import kmruiz.domain.post.PostViewIdQuery
import kmruiz.domain.post.PostViewReadModel

class SQLPostViewReadModel: PostViewReadModel {
    override fun findLast(idQuery: PostViewIdQuery) = emptyList<Post>()
}
