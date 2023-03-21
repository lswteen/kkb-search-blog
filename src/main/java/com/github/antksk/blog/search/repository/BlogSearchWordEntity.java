package com.github.antksk.blog.search.repository;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "t_blog_search_word")
public class BlogSearchWordEntity extends CreateAndModifyDateTime {
    @Id
    @GeneratedValue
    @Column(name = "seq")
    private Long id;

    @Column(name = "word", nullable = false, length = 50)
    private String word;

    private Long count;

    public void modifyCount(long count){
        this.count = count;
    }

    @Builder
    BlogSearchWordEntity(Long id, String word, Long count) {
        this.id = id;
        this.word = word;
        this.count = count;
    }
}