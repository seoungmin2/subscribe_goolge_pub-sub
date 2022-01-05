package com.sm.subscribe_google_pubsub.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSubscribeLogEntity is a Querydsl query type for SubscribeLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscribeLogEntity extends EntityPathBase<SubscribeLogEntity> {

    private static final long serialVersionUID = 1278081439L;

    public static final QSubscribeLogEntity subscribeLogEntity = new QSubscribeLogEntity("subscribeLogEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath payload = createString("payload");

    public final EnumPath<StateEnum> state = createEnum("state", StateEnum.class);

    public QSubscribeLogEntity(String variable) {
        super(SubscribeLogEntity.class, forVariable(variable));
    }

    public QSubscribeLogEntity(Path<SubscribeLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubscribeLogEntity(PathMetadata metadata) {
        super(SubscribeLogEntity.class, metadata);
    }

}

