(ns stm4clj.backsidee-api)

(defprotocol backside
  (put [proxy])
  (get [locator])
  (delete [locator])
  

  (find [query])
  (list_proxiei [offset, count])

  )


