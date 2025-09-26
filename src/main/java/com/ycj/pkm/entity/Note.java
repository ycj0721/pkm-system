package com.ycj.pkm.entity;

import java.time.LocalDateTime;

/**
 * 笔记实体类，用于封装笔记的相关信息
 */
public class Note {
    // 字段（属性）- 使用private封装
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    // 无参构造方法
    public Note() {
        this.createTime = LocalDateTime.now();
        this.updateTime = LocalDateTime.now();
    }

    // 带参构造方法（标题和内容）
    public Note(String title, String content) {
        this(); // 调用无参构造方法初始化时间
        this.title = title;
        this.content = content;
    }

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.updateTime = LocalDateTime.now(); // 修改标题时更新时间
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.updateTime = LocalDateTime.now(); // 修改内容时更新时间
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    // 创建时间不提供setter，避免被随意修改
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    // 更新时间通过修改标题/内容自动更新，不提供手动setter
}
