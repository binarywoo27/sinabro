package com.ssafy.osws.user.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -189748914L;

    public static final QUser user = new QUser("user");

    public final StringPath email = createString("email");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> no = createNumber("no", Integer.class);

    public final StringPath originalName = createString("originalName");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final StringPath refreshToken = createString("refreshToken");

    public final StringPath role = createString("role");

    public final StringPath savedName = createString("savedName");

    public final StringPath userId = createString("userId");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

