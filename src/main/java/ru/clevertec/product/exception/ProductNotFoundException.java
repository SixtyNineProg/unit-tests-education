package ru.clevertec.product.exception;

import java.util.UUID;

public class ProductNotFoundException extends RuntimeException {

  public static final String DEFAULT_MESSAGE = "Product not found";

  /**
   * Сообщение должно быть именно такого формата
   *
   * @param uuid - идентификатор продукта
   */
  public ProductNotFoundException(UUID uuid) {
    super(String.format("Product with uuid: %s not found", uuid));
  }

  public ProductNotFoundException() {
    super(DEFAULT_MESSAGE);
  }
}
