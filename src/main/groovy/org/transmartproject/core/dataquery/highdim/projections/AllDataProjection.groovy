package org.transmartproject.core.dataquery.highdim.projections


public interface AllDataProjection extends Projection<Map<String, Object>>, MultiValueProjection {

    /**
     * Returns a map with the names and types of the datatype specific properties that
     * are available on the rows belonging to this datatype. The returned map has a
     * stable and meaningful iteration order.
     */
    public Map<String, Class> getRowProperties()

}
