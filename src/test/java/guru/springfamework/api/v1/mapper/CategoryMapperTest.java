package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryMapperTest {
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDto() {
        //given
        Category category = new Category();
        category.setId(2L);
        category.setName("def");
        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDto(category);
        //then
        assertEquals(Long.valueOf(2L), categoryDTO.getId());
        assertEquals("def", categoryDTO.getName());
    }
}