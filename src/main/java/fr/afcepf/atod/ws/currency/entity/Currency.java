package fr.afcepf.atod.ws.currency.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
/**
 * Currency entity.
 * @author nikko
 *
 */
@Entity
@NamedQuery(name = "currency.findAll", query = "SELECT c FROM Currency c")
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
    @Override
    public String toString() {
        return "Currency [id=" + id + ", name=" + name + ", code="
                + code + ", rate=" + rate + "]";
    }
}
