
public class DotCollector implements ICollector {

	DotListener listener;
	
	@Override
	public void collect() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setListener(NginxBaseListener listener) {
		this.listener=(DotListener)listener;

	}

	@Override
	public NginxBaseListener getListener() {
		return this.listener;
	}

}
