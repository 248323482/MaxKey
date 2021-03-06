/**
 * 
 */
package org.maxkey.dao.persistence;

import org.apache.mybatis.jpa.persistence.IJpaBaseMapper;
import org.maxkey.domain.apps.AppsTokenBasedDetails;

/**
 * @author Crystal.sea
 *
 */
public  interface AppsTokenBasedDetailsMapper extends IJpaBaseMapper<AppsTokenBasedDetails> {
	
	public  AppsTokenBasedDetails  getAppDetails(String id);
}
