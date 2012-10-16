/**
 * Tival
 */
package cl.tival.logistiki.model.accounting;

import java.io.Serializable;
import java.util.List;

import cl.tival.logistiki.model.BaseEntity;

/**
 * Represents an account plan (plan de cuentas).<br>
 * The account plan can be a template, to be used as a model to copy and edit a discretion.<br>
 * 
 * <b>Change log:</b>
 * <ul>
 * <li>1.0 Oct 16, 2012 - Jorge Guerrero (jguerrero) - initial version</li>
 * </ul>
 * 
 * @author Jorge Guerrero (jguerrero)
 * @version 1.0
 */
public class AccountPlan extends BaseEntity implements Serializable {

	private static final long	serialVersionUID	= 1L;
	private String					name;						// name of the account plan
	private Boolean				template;					// is a template account plan
	private Byte					depthLevels;				// how many depth levels have the hierarchy tree of the account plan.
	private List<Account>		accounts;					// list of accounts

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *           the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the template
	 */
	public Boolean getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *           the template to set
	 */
	public void setTemplate(Boolean template) {
		this.template = template;
	}

	/**
	 * @return the depthLevels
	 */
	public Byte getDepthLevels() {
		return depthLevels;
	}

	/**
	 * @param depthLevels
	 *           the depthLevels to set
	 */
	public void setDepthLevels(Byte depthLevels) {
		this.depthLevels = depthLevels;
	}

	/**
	 * @return the accounts
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts
	 *           the accounts to set
	 */
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
