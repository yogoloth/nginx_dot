
public interface ICollector {
	// public void collect(NginxBaseListener listener);
	public void collect();

	public void setListener(NginxBaseListener listener);

	public NginxBaseListener getListener();
}
