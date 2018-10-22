/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.astra.anblicks.pdca.service;

import aQute.bnd.annotation.ProviderType;

import com.astra.anblicks.pdca.model.addkpi_ci;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for addkpi_ci. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see addkpi_ciLocalServiceUtil
 * @see com.astra.anblicks.pdca.service.base.addkpi_ciLocalServiceBaseImpl
 * @see com.astra.anblicks.pdca.service.impl.addkpi_ciLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface addkpi_ciLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link addkpi_ciLocalServiceUtil} to access the addkpi_ci local service. Add custom service methods to {@link com.astra.anblicks.pdca.service.impl.addkpi_ciLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the addkpi_ci to the database. Also notifies the appropriate model listeners.
	*
	* @param addkpi_ci the addkpi_ci
	* @return the addkpi_ci that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public addkpi_ci addaddkpi_ci(addkpi_ci addkpi_ci);

	/**
	* Creates a new addkpi_ci with the primary key. Does not add the addkpi_ci to the database.
	*
	* @param addKpiId the primary key for the new addkpi_ci
	* @return the new addkpi_ci
	*/
	public addkpi_ci createaddkpi_ci(long addKpiId);

	/**
	* Deletes the addkpi_ci from the database. Also notifies the appropriate model listeners.
	*
	* @param addkpi_ci the addkpi_ci
	* @return the addkpi_ci that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public addkpi_ci deleteaddkpi_ci(addkpi_ci addkpi_ci);

	/**
	* Deletes the addkpi_ci with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param addKpiId the primary key of the addkpi_ci
	* @return the addkpi_ci that was removed
	* @throws PortalException if a addkpi_ci with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public addkpi_ci deleteaddkpi_ci(long addKpiId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public addkpi_ci fetchaddkpi_ci(long addKpiId);

	/**
	* Returns the addkpi_ci with the matching UUID and company.
	*
	* @param uuid the addkpi_ci's UUID
	* @param companyId the primary key of the company
	* @return the matching addkpi_ci, or <code>null</code> if a matching addkpi_ci could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public addkpi_ci fetchaddkpi_ciByUuidAndCompanyId(java.lang.String uuid,
		long companyId);

	/**
	* Returns the addkpi_ci with the primary key.
	*
	* @param addKpiId the primary key of the addkpi_ci
	* @return the addkpi_ci
	* @throws PortalException if a addkpi_ci with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public addkpi_ci getaddkpi_ci(long addKpiId) throws PortalException;

	/**
	* Returns the addkpi_ci with the matching UUID and company.
	*
	* @param uuid the addkpi_ci's UUID
	* @param companyId the primary key of the company
	* @return the matching addkpi_ci
	* @throws PortalException if a matching addkpi_ci could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public addkpi_ci getaddkpi_ciByUuidAndCompanyId(java.lang.String uuid,
		long companyId) throws PortalException;

	/**
	* Updates the addkpi_ci in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param addkpi_ci the addkpi_ci
	* @return the addkpi_ci that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public addkpi_ci updateaddkpi_ci(addkpi_ci addkpi_ci);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of addkpi_cis.
	*
	* @return the number of addkpi_cis
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getaddkpi_cisCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns a range of all the addkpi_cis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.astra.anblicks.pdca.model.impl.addkpi_ciModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of addkpi_cis
	* @param end the upper bound of the range of addkpi_cis (not inclusive)
	* @return the range of addkpi_cis
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<addkpi_ci> getaddkpi_cis(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}