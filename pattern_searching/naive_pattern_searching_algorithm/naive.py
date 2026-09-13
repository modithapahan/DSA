def search(text, pattern):
    txt_len = len(text)
    pat_len = len(pattern)

    for i in range(txt_len - pat_len):
        for j in range(pat_len):
            k = j + 1
            if text[i + j] != pattern[j]:
                break
        if k == pat_len:
            print(f'Pattern found at index {i}')

text = 'AABAACAADAABAAABAA'
pattern = 'AABA'

search(text,pattern)
