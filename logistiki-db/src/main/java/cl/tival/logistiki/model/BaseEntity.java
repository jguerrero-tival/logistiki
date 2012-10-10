package cl.tival.logistiki.model;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {

	private static final long	serialVersionUID	= 1L;
	private Long					id;
	private Date					creationDate;
	private Date					lastUpdateDate;
	private Boolean				editable;

}
