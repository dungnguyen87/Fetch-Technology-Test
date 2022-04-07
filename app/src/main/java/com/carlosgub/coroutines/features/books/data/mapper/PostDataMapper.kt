package com.carlosgub.coroutines.features.books.data.mapper

import com.carlosgub.coroutines.core.mapper.Mapper
import com.carlosgub.coroutines.features.books.data.datasource.rest.response.PostResponseData
import com.carlosgub.coroutines.features.books.domain.model.PostEntity

class PostDataMapper : Mapper<PostResponseData, PostEntity> {
    override fun map(origin: PostResponseData) =
        PostEntity(
            base = origin.base,
            counter = origin.counter,
            buy_price = origin.buy_price,
            sell_price = origin.sell_price,
            icon = origin.icon,
            name = origin.name
        )
}