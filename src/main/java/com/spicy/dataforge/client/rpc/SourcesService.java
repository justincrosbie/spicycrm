package com.spicy.dataforge.client.rpc;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.spicy.dataforge.client.domain.Source;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("sources")
public interface SourcesService extends RemoteService {
	
	List<Source> getSources();
	List<Source> addSource(Source source);
	List<Source> deleteSource(Integer sourceId);
}
