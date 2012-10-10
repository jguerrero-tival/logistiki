package cl.tival.logistiki.model.accounting;

import java.io.Serializable;
import java.util.List;

import cl.tival.logistiki.model.BaseEntity;

/**
 * @author jguerrero
 *         9-oct-2012
 *         Plan de Cuentas
 */
public class AccountPlan extends BaseEntity implements Serializable {

	private static final long		serialVersionUID	= 1L;
	private String						name;
	private List<Account>	ledgerAccounts;

}
