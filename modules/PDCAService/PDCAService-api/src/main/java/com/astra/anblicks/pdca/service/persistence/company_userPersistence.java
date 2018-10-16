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

package com.astra.anblicks.pdca.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.astra.anblicks.pdca.exception.NoSuchcompany_userException;
import com.astra.anblicks.pdca.model.company_user;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the company_user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.persistence.impl.company_userPersistenceImpl
 * @see company_userUtil
 * @generated
 */
@ProviderType
public interface company_userPersistence extends BasePersistence<company_user> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link company_userUtil} to access the company_user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the company_user where companyId = &#63; or throws a {@link NoSuchcompany_userException} if it could not be found.
	*
	* @param companyId the company ID
	* @return the matching company_user
	* @throws NoSuchcompany_userException if a matching company_user could not be found
	*/
	public company_user findBygetByUserList(long companyId)
		throws NoSuchcompany_userException;

	/**
	* Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	*/
	public company_user fetchBygetByUserList(long companyId);

	/**
	* Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	*/
	public company_user fetchBygetByUserList(long companyId,
		boolean retrieveFromCache);

	/**
	* Removes the company_user where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @return the company_user that was removed
	*/
	public company_user removeBygetByUserList(long companyId)
		throws NoSuchcompany_userException;

	/**
	* Returns the number of company_users where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching company_users
	*/
	public int countBygetByUserList(long companyId);

	/**
	* Returns the company_user where companyId = &#63; or throws a {@link NoSuchcompany_userException} if it could not be found.
	*
	* @param companyId the company ID
	* @return the matching company_user
	* @throws NoSuchcompany_userException if a matching company_user could not be found
	*/
	public company_user findBygetByCompanyList(long companyId)
		throws NoSuchcompany_userException;

	/**
	* Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	*/
	public company_user fetchBygetByCompanyList(long companyId);

	/**
	* Returns the company_user where companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching company_user, or <code>null</code> if a matching company_user could not be found
	*/
	public company_user fetchBygetByCompanyList(long companyId,
		boolean retrieveFromCache);

	/**
	* Removes the company_user where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @return the company_user that was removed
	*/
	public company_user removeBygetByCompanyList(long companyId)
		throws NoSuchcompany_userException;

	/**
	* Returns the number of company_users where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching company_users
	*/
	public int countBygetByCompanyList(long companyId);

	/**
	* Caches the company_user in the entity cache if it is enabled.
	*
	* @param company_user the company_user
	*/
	public void cacheResult(company_user company_user);

	/**
	* Caches the company_users in the entity cache if it is enabled.
	*
	* @param company_users the company_users
	*/
	public void cacheResult(java.util.List<company_user> company_users);

	/**
	* Creates a new company_user with the primary key. Does not add the company_user to the database.
	*
	* @param company_user_Id the primary key for the new company_user
	* @return the new company_user
	*/
	public company_user create(long company_user_Id);

	/**
	* Removes the company_user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param company_user_Id the primary key of the company_user
	* @return the company_user that was removed
	* @throws NoSuchcompany_userException if a company_user with the primary key could not be found
	*/
	public company_user remove(long company_user_Id)
		throws NoSuchcompany_userException;

	public company_user updateImpl(company_user company_user);

	/**
	* Returns the company_user with the primary key or throws a {@link NoSuchcompany_userException} if it could not be found.
	*
	* @param company_user_Id the primary key of the company_user
	* @return the company_user
	* @throws NoSuchcompany_userException if a company_user with the primary key could not be found
	*/
	public company_user findByPrimaryKey(long company_user_Id)
		throws NoSuchcompany_userException;

	/**
	* Returns the company_user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param company_user_Id the primary key of the company_user
	* @return the company_user, or <code>null</code> if a company_user with the primary key could not be found
	*/
	public company_user fetchByPrimaryKey(long company_user_Id);

	@Override
	public java.util.Map<java.io.Serializable, company_user> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the company_users.
	*
	* @return the company_users
	*/
	public java.util.List<company_user> findAll();

	/**
	* Returns a range of all the company_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_users
	* @param end the upper bound of the range of company_users (not inclusive)
	* @return the range of company_users
	*/
	public java.util.List<company_user> findAll(int start, int end);

	/**
	* Returns an ordered range of all the company_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_users
	* @param end the upper bound of the range of company_users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of company_users
	*/
	public java.util.List<company_user> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_user> orderByComparator);

	/**
	* Returns an ordered range of all the company_users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link company_userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of company_users
	* @param end the upper bound of the range of company_users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of company_users
	*/
	public java.util.List<company_user> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<company_user> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the company_users from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of company_users.
	*
	* @return the number of company_users
	*/
	public int countAll();
}