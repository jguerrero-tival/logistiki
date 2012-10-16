/**
 * Tival
 */
package cl.tival.logistiki.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * This model entity is to be extended by others, to reutilization of common
 * properties that are not part of the model.<br>
 * <br>
 * 
 * <b>Change log:</b>
 * <ul>
 * <li>1.0 Oct 16, 2012 - Jorge Guerrero (jguerrero) - initial version</li>
 * </ul>
 * 
 * @author Jorge Guerrero (jguerrero)
 * @version 1.0
 */
public class BaseEntity implements Serializable {

	private static final long	serialVersionUID	= 1L;
	private Long					id;
	private Timestamp				creationDate;
	private Timestamp				lastUpdateDate;
	private Boolean				editable;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *           the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the creationDate
	 */
	public Timestamp getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 *           the creationDate to set
	 */
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the lastUpdateDate
	 */
	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * @param lastUpdateDate
	 *           the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * @return the editable
	 */
	public Boolean getEditable() {
		return editable;
	}

	/**
	 * @param editable
	 *           the editable to set
	 */
	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

}
