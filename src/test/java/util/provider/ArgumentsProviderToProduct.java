package util.provider;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import util.ProductTestData;

public class ArgumentsProviderToProduct implements ArgumentsProvider {
  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
    return Stream.of(
        Arguments.of(
            ProductTestData.builder().build().buildProductDto(),
            ProductTestData.builder().build().buildProduct()),
        Arguments.of(
            ProductTestData.builder().build().buildProductDto(),
            ProductTestData.builder().build().buildProduct()));
  }
}
