package com.sm.subscribe_google_pubsub.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserSubscribeEntity is a Querydsl query type for UserSubscribeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserSubscribeEntity extends EntityPathBase<UserSubscribeEntity> {

    private static final long serialVersionUID = 1340434240L;

    public static final QUserSubscribeEntity userSubscribeEntity = new QUserSubscribeEntity("userSubscribeEntity");

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath linkedPurchaseToken = createString("linkedPurchaseToken");

    public final StringPath orderId = createString("orderId");

    public final StringPath purchaseToken = createString("purchaseToken");

    public final DateTimePath<java.util.Date> startDate = createDateTime("startDate", java.util.Date.class);

    public QUserSubscribeEntity(String variable) {
        super(UserSubscribeEntity.class, forVariable(variable));
    }

    public QUserSubscribeEntity(Path<UserSubscribeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserSubscribeEntity(PathMetadata metadata) {
        super(UserSubscribeEntity.class, metadata);
    }

}

