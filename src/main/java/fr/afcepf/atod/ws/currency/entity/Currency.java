package fr.afcepf.atod.ws.currency.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Currency entity.
 * @author nikko
 *
 */
@Entity
@XmlRootElement(namespace = "http://entity.currency.ws.atod.afcepf.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency implements Serializable {

    /**
     * Serialization Id.
     */
    private static final long serialVersionUID = 394252803490520537L;
    /**
     * Unique identifier.
     */
    @Id
    private Integer id;
    /**
     * Currency name.
     */
    private String name;
    /**
     * Currency code.
     */
    private String code;
    /**
     * Exchange rate based on dollar.
     */
    private Double rate;
    /**
     * Creation date of the currency.
     */
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    /**
     * Update date of the currency.
     */
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    /**
     * Default constructor.
     */
    public Currency() {
        super();
    }
    /**
     * Constructor with parameters.
     * @param paramId id
     * @param paramName name
     * @param paramCode code iso
     * @param paramRate exchange rate
     */
    public Currency(Integer paramId, String paramName, String paramCode,
            Double paramRate) {
        super();
        id = paramId;
        name = paramName;
        code = paramCode;
        rate = paramRate;
    }
    /**
     * public accessor for id.
     * @return Integer id
     */
    public Integer getId() {
        return id;
    }
    /**
     * public mutator for id.
     * @param paramId id
     */
    public void setId(Integer paramId) {
        id = paramId;
    }
    /**
     * public accessor for name.
     * @return String name
     */
    public String getName() {
        return name;
    }
    /**
     * public mutator for name.
     * @param paramName name
     */
    public void setName(String paramName) {
        name = paramName;
    }
    /**
     * public accessor for code.
     * @return String code
     */
    public String getCode() {
        return code;
    }
    /**
     * public mutator for code.
     * @param paramCode code
     */
    public void setCode(String paramCode) {
        code = paramCode;
    }
    /**
     * public accessor for rate.
     * @return Double rate
     */
    public Double getRate() {
        return rate;
    }
    /**
     * public mutator for rate.
     * @param paramRate rate
     */
    public void setRate(Double paramRate) {
        rate = paramRate;
    }
    /**
     * public accessor for createdAt.
     * @return Date createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }
    /**
     * public accessor for updatedAt.
     * @return Date updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }
    @Override
    public String toString() {
        return "Currency [id=" + id + ", name=" + name + ", code="
                + code + ", rate=" + rate + "]";
    }
    /**
     * Tentative de gestion des dates automatiques.
     */
    @PrePersist
    void createdAt() {
      Date d = new Date();
      this.createdAt = d;
      this.updatedAt = d;
    }
    /**
     * Tentative de gestion des dates automatiques.
     */
    @PreUpdate
    void updatedAt() {
      this.updatedAt = new Date();
    }
}
