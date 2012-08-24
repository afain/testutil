package eu.execom.testutil;

import java.util.ArrayList;
import java.util.List;

import eu.execom.testutil.model.EntityTierOneType;
import eu.execom.testutil.model.EntityTierTwoType;
import eu.execom.testutil.model.Type;

/**
 * TODO add comments
 * 
 * @author Dusko Vesin
 * @author Nikola Olah
 * @author Bojan Babic
 * @author Nikola Trkulja
 */
public abstract class AbstractExecomRepositoryAssertTest extends AbstractExecomRepositoryAssert<Type, Integer> {
    // mock lists
    private List<EntityTierOneType> list1 = new ArrayList<EntityTierOneType>();
    private List<EntityTierTwoType> list2 = new ArrayList<EntityTierTwoType>();

    @Override
    protected List<?> findAll(final Class<?> entityClass) {
        if (entityClass == EntityTierOneType.class) {
            return list1;
        }
        if (entityClass == EntityTierTwoType.class) {
            return list2;
        }
        return null;
    }

    @Override
    protected Type findById(final Class<?> entityClass, final Integer id) {
        if (entityClass == EntityTierOneType.class) {
            for (final EntityTierOneType entity : list1) {
                if (entity.getId() == id) {
                    return entity;
                }
            }
        }
        return null;
    }

    @Override
    public void initEntityTypes() {
        getEntityTypes().add(EntityTierOneType.class);
        getEntityTypes().add(EntityTierTwoType.class);
    }

    @Override
    public void initComplexTypes() {
        getComplexTypes().add(EntityTierTwoType.class);
        getComplexTypes().add(EntityTierOneType.class);
    }

    @Override
    public void initIgnoredTypes() {
    }

    @Override
    protected <T> void customAssertEquals(final T expected, final T actual) {
        assertEquals(expected, actual);
    }

    public List<EntityTierOneType> getList1() {
        return list1;
    }

    public void setList1(final List<EntityTierOneType> list1) {
        this.list1 = list1;
    }

    public List<EntityTierTwoType> getList2() {
        return list2;
    }

    public void setList2(final List<EntityTierTwoType> list2) {
        this.list2 = list2;
    }

}