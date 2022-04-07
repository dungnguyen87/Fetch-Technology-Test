package com.carlosgub.coroutines.features.books.presentation.model.mapper

import com.carlosgub.coroutines.core.mapper.Mapper
import com.carlosgub.coroutines.features.books.domain.model.PostEntity
import com.carlosgub.coroutines.features.books.presentation.model.PostVM

class PostVMMapper : Mapper<PostEntity, PostVM> {
    override fun map(origin: PostEntity) =
        PostVM(
            base = origin.base,
            counter = origin.counter,
            buy_price = origin.buy_price,
            sell_price = origin.sell_price,
            icon = origin.icon,
            name = origin.name
        )
}