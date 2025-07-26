import pandas as pd

def find_customers(customer: pd.DataFrame, product: pd.DataFrame) -> pd.DataFrame:
    products = set()
    for i, p in enumerate(product["product_key"]):
        products.add(p)
    print(products)
    d = defaultdict(set)
    for i, c in enumerate(customer["customer_id"]):
        d[c].add(customer["product_key"][i])
    print(d)
    ans = []
    for k in d:
        if d[k] == products:
            ans.append(k)
    res = pd.DataFrame()
    res["customer_id"] = ans
    return res