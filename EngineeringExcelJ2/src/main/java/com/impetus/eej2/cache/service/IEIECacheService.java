package com.impetus.eej2.cache.service;

import com.impetus.eej2.cache.entity.EIERequest;
import com.impetus.eej2.cache.entity.EIEResponse;

public interface IEIECacheService {
	public EIEResponse getEIEresponse(EIERequest EieRequest);

	public Boolean addEIEexternalResponse(EIEResponse EieResponse);
      
}
