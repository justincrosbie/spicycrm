package com.spicy.dataforge.server;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.spicy.dataforge.client.domain.Source;
import com.spicy.dataforge.client.rpc.SourcesService;
import com.spicy.dataforge.server.utils.Shared;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class SourcesServiceImpl extends RemoteServiceServlet implements
		SourcesService {

	public List<Source> getSources() {
		List sources = (List)Shared.get("sources");
		if ( sources == null ) {
			sources = new ArrayList();
			Shared.set("sources", sources);
		}
		return sources;
	}

	public List<Source> addSource(Source source) {
		List sources = (List)Shared.get("sources");
		if ( sources == null ) {
			sources = new ArrayList();
		}
		
		sources.add(source);

		Shared.set("sources", sources);
		
		return sources;
	}

	public List<Source> deleteSource(Integer sourceId) {
		List sources = (List)Shared.get("sources");
		if ( sources == null ) {
			sources = new ArrayList();
		}
		
		Source s = (Source)sources.get(sourceId);
		String name = s.getName();
		Source s2 = (Source)sources.remove(sourceId.intValue());

		Shared.set("sources", sources);
		
		return sources;
	}
}
