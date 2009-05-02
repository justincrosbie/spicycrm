package com.spicy.dataforge.client.rpc;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.spicy.dataforge.client.domain.Source;

/**
 * The async counterpart of <code>SourcesService</code>.
 */
public interface SourcesServiceAsync {
	void getSources(AsyncCallback<List<Source>> callback);
	void addSource(Source source, AsyncCallback<List<Source>> callback);
	void deleteSource(Integer sourceId, AsyncCallback<List<Source>> callback);
}
