import java.util.HashMap;

public class UpstreamCollector implements ICollector {
	private static HashMap<String, Upstream> upstreams = new HashMap<String, Upstream>();

	UpstreamListener listener;

	@Override
	public void collect() {
		getUpstreams().putAll(listener.upstreams);
	}

	@Override
	public void setListener(NginxBaseListener listener) {
		this.listener = (UpstreamListener) listener;
	}

	@Override
	public NginxBaseListener getListener() {
		return this.listener;
	}

	public HashMap<String, Upstream> getUpstreams() {
		return upstreams;
	}

	public static void setUpstreams(HashMap<String, Upstream> upstreams) {
		UpstreamCollector.upstreams = upstreams;
	}

}
