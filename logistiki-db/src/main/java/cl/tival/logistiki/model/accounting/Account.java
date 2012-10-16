/**
 * Tival
 */
package cl.tival.logistiki.model.accounting;

import java.io.Serializable;
import java.util.List;

import cl.tival.logistiki.model.BaseEntity;

/**
 * Represent an accounting account, for an accounting plan (Cuenta Contable).<br>
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
public class Account extends BaseEntity implements Serializable {

	private static final long	serialVersionUID	= 1L;
	private Long					code;						// account code
	// TODO Analize if is necessary add the code into separate fields depending of the level
	private String					name;						// account name
	private String					type;						// account type, ie. debit/credit/other
	// TODO Define the code types and change to enum
	private String					depth;						// depth of the account, from 1 to 4.
	// TODO determine the usefullness of the depth param.
	private Account				parentAccount;			// the parent account in the hierarchy (null if do not have parent)
	private List<Account>		childAccounts;			// the child account in the hierarchy (empty list if do not has childrens)
	private AccountPlan			accountPlan;				// the account plan for this account

	/**
	 * @return the code
	 */
	public Long getCode() {
		return code;
	}

	/**
	 * @param code
	 *           the code to set
	 */
	public void setCode(Long code) {
		this.code = code;
	}

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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *           the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the depth
	 */
	public String getDepth() {
		return depth;
	}

	/**
	 * @param depth
	 *           the depth to set
	 */
	public void setDepth(String depth) {
		this.depth = depth;
	}

	/**
	 * @return the parentAccount
	 */
	public Account getParentAccount() {
		return parentAccount;
	}

	/**
	 * @param parentAccount
	 *           the parentAccount to set
	 */
	public void setParentAccount(Account parentAccount) {
		this.parentAccount = parentAccount;
	}

	/**
	 * @return the childAccounts
	 */
	public List<Account> getChildAccounts() {
		return childAccounts;
	}

	/**
	 * @param childAccounts
	 *           the childAccounts to set
	 */
	public void setChildAccounts(List<Account> childAccounts) {
		this.childAccounts = childAccounts;
	}

	/**
	 * @return the accountPlan
	 */
	public AccountPlan getAccountPlan() {
		return accountPlan;
	}

	/**
	 * @param accountPlan
	 *           the accountPlan to set
	 */
	public void setAccountPlan(AccountPlan accountPlan) {
		this.accountPlan = accountPlan;
	}

}
