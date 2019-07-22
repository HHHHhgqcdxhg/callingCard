package com.ggemo.callingCard.provider.db.dos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hhhhhg
 */
public class CardsDO implements Serializable {
    /**
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     *
     * @mbg.generated
     */
    private Byte access;

    /**
     *
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     *
     * @mbg.generated
     */
    private Long target;

    /**
     *
     * @return the value of cards.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id the value for cards.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return the value of cards.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     *
     * @param userId the value for cards.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     *
     * @return the value of cards.access
     *
     * @mbg.generated
     */
    public Byte getAccess() {
        return access;
    }

    /**
     *
     * @param access the value for cards.access
     *
     * @mbg.generated
     */
    public void setAccess(Byte access) {
        this.access = access;
    }

    /**
     *
     * @return the value of cards.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt the value for cards.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return the value of cards.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt the value for cards.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return the value of cards.target
     *
     * @mbg.generated
     */
    public Long getTarget() {
        return target;
    }

    /**
     *
     * @param target the value for cards.target
     *
     * @mbg.generated
     */
    public void setTarget(Long target) {
        this.target = target;
    }

    /**
     * @return
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", access=").append(access);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", target=").append(target);
        sb.append("]");
        return sb.toString();
    }
}